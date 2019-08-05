# enum
Java枚举类测试

线上产品出现了一个bug：
```java
StingUtils.contains(driverClassName, DataBaseType.MYSQL.name());
```
这条语句找不到DataBaseType中的驱动类名称，后来打印`DataBaseType.MYSQL.name()`的值是`MYSQL`才发现这段代码是错误的，写一段测试来比较name属性、name()方法和
getName()方法的返回值差异，提醒自己不要犯类似的错误。建议采用`DataBaseType.MYSQL.getName()`的方式。

```java
public enum  DataBaseType {
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
