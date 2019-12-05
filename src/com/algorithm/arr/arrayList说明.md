---
                                    ArrayList理解

---
java开发的朋友们都知道,ArrayList 是我们最常用的数据结构了.我们用它来存储数据。现在就探索一下它的底层实现。
一般对于一个陌生的类，我们想使用它，都会先看它构造方法，再看它的属性和方法

**1.ArryList的属性**

``` javascript
    //默认容量大小
    private static final int DEFAULT_CAPACITY = 10;
    //空的数组
    private static final Object[] EMPTY_ELEMENTDATA = {};
    //默认空数组    
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    //真正存放数组的数组
    transient Object[] elementData; 
    //大小
    private int size;
```
**2构造方法**

我们平时一般都是 new ArrayList(); 那我们先看看空的构造方法

``` javascript
 public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
```
代码很简单 就是初始化一个空的数组
看到这里  我们就已经明白了 ArrayList  其实底层就是数组
数据结构无非就是增删改查 我们接下来看一下它的方法

**3.方法介绍**

**3.1 add方法(增)**

``` javascript
    public boolean add(E e) {
            //判断数组的大小,必要时扩容
            ensureCapacityInternal(size + 1);  // Increments modCount!!
            elementData[size++] = e;
            return true;
        }
        
    private static int calculateCapacity(Object[] elementData, int minCapacity) {
        //如果是默认的构造方法,那么初始化大小就是10
        if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            return Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        return minCapacity;
    }

    private void ensureCapacityInternal(int minCapacity) {
        ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
    }
    
    private void ensureExplicitCapacity(int minCapacity) {
        modCount++;
        // 如果数组已经放不了这么多元素 就需要扩容了
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }
        
```
我们来看一下grow 方法的逻辑

``` javascript
 private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        >>1 移位操作  新的数组的长度为旧的1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        /**
        *如果发现扩容之后的值大于我们规定的最大值，则判断size+1的值是否大于MAX_ARRAY_SIZE的值，
        *大于则取值MAX_VALUE，反之则MAX_ARRAY_SIZE，也就数说容器最大的数量为MAX_VALUE
        */
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        //复制一个新数组
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
```
核心思想就是往数组添加元素,如果长度不够,就扩容。
扩容是一个非常耗资源的一个操作,如果我们大概知道数据的大小,就可以初始化的时候,给一个值。

``` javascript
  public ArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        }
    }
```
**3.2 remove方法(删)**

先看代码

``` javascript
    public boolean remove(Object o) {
        //判断元素是不是null
        if (o == null) {
            for (int index = 0; index < size; index++)
                if (elementData[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                //遍历数组 找到数组中为0的对象
                if (o.equals(elementData[index])) {
                    //执行删除操作
                    fastRemove(index);
                    return true;
                }
        }
        return false;
    }
    
     private void fastRemove(int index) {
        modCount++;
        int numMoved = size - index - 1;
        if (numMoved > 0)
        //重新生成数组 即index 以后的数组的位置都往前面移一位 
            System.arraycopy(elementData, index+1, elementData, index,
                             numMoved);
        //最后一个元素置为null
        elementData[--size] = null; // clear to let GC do its work
    }
```
删除元素 就是找打数组的元素 然后把这个元素以后的元素位置都往前面移动一位
System.arraycopy(a,0,b,0,10) 从数组a中的第0个位置开始复制10个数，复制到b中，从b中的0位置开始存放

**3.3 set 方法(改)**

``` javascript
    public E set(int index, E element) {
        //判断index是否越界
        rangeCheck(index);

        E oldValue = elementData(index);
        //index位置重新赋值
        elementData[index] = element;
        //返回旧元素
        return oldValue;
    }
    
    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
```
**3.4 get(查)**

``` javascript
  public E get(int index) {
        //判断index是否越界
        rangeCheck(index);
        //返回元素
        return elementData(index);
    }
```
***总结***
ArrayList 就是底层维护了一个数组,我们对元素的操作都是对数组的操作
还有很多重载的方法,大家可以自行阅读，
**问？**
为什么遍历list的时候 直接remove会报错  用迭代器就可以 






