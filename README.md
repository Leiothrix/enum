# enum
Java枚举类测试

线上产品出现了一个bug：
```java
StingUtils.contains(driverClassName, DataBaseType.MYSQL.name());
```
这条语句找不到DataBaseType中的驱动类名称，后来打印`DataBaseType.MYSQL.name()`的值是`MYSQL`才发现这段代码是错误的，原因一是字段名采用了容易引起混淆的`name`，二是没有使用get方法获取枚举项的属性，建议采用`DataBaseType.MYSQL.getValue()`的方式获取。

## 原代码

```java
public enum DataBaseType {
    /**
     * MYSQL
     */
    MYSQL("com.mysql.jdbc.Driver"),

     /**
     * ORACLE
     */
    ORACLE("oracle.jdbc.driver.OracleDriver"),

     /**
     * POSTGRESQL
     */
    POSTGRESQL("org.postgresql.Driver"),

     /**
     * SQLSERVER
     */
    SQLSERVER("com.microsoft.sqlserver.jdbc.SQLServerDriver"),

     /**
     * ELASTICSEARCH
     */
    ELASTICSEARCH("elasticsearch");

     private String name;

     DataBaseType(String name) {
        this.name = name;
    }

     public String getName() {
        return name;
    }

     public void setName(String name) {
        this.name = name;
    }

 }
```

## 改进代码

```java
public enum DataBaseType {
    /**
     * MYSQL
     */
    MYSQL("com.mysql.jdbc.Driver"),

    /**
     * ORACLE
     */
    ORACLE("oracle.jdbc.driver.OracleDriver"),

    /**
     * POSTGRESQL
     */
    POSTGRESQL("org.postgresql.Driver"),

    /**
     * SQLSERVER
     */
    SQLSERVER("com.microsoft.sqlserver.jdbc.SQLServerDriver"),

    /**
     * ELASTICSEARCH
     */
    ELASTICSEARCH("elasticsearch");

    /**
     * 括号里面是几个参数，就需要定义几个字段，语法糖(●ˇ∀ˇ●)
     */
    private String value;

    DataBaseType(String value) {
        this.value = value;
    }

    /**
     * 枚举类中避免出现set方法，毕竟是个final，违背初衷
     */
    public String getValue() {
        return value;
    }

    /**
     * 枚举属性原有的样子
     */
    public static final String AAA = "汪汪汪";

    public static void main(String[] args){
        /*
         * 注意此处value的值是可以直接被访问的，因为在内部，但是在外部必须使用get方法获取
         */
        System.out.println("name方法返回值：" + DataBaseType.MYSQL.name());
        System.out.println("value属性返回值：" + DataBaseType.MYSQL.value);
        System.out.println("getValue()方法返回值：" + DataBaseType.MYSQL.getValue());
    }
}
```

### 输出

```
name方法返回值：MYSQL
value属性返回值：com.mysql.jdbc.Driver
getValue()方法返回值：com.mysql.jdbc.Driver
```

另外可以查看编译后的DataBaseType.class文件，构造方法`DataBaseType`被加上了`private`限定符

```
private DataBaseType(String value) {
        this.value = value;
    }
```
