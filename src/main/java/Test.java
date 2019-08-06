/**
 * @author adam
 * @date 2019/5/24
 * PS: You may say I'm a dreamer.But I'm not the only one.
 */
public class Test {
    public static void main(String[] args) {
        /*
         * 使用DataBaseType.MYSQL.value无法获取DataBaseType中的值，因为value限定访问权限为private，只能使用getValue()获得
         * 另外，尽量避免使用name作为属性字段的名称，因为这样容易引起混淆，不好分辨
         */
        System.out.println("name方法返回值：" + DataBaseType.MYSQL.name());
        System.out.println("getValue()方法返回值：" + DataBaseType.MYSQL.getValue());
    }
}
