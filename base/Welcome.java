package base;

/**
 *这是文档注释,主要用于开发环境
 *@author yyy
 *@version 1.0
 */
 // 表示类名的标识符：每个单词首字母大写，如Man，GoodMan
 // 表示方法和变量的标识符：第一个单词小写，从第二个单词开始首字母大写，驼峰原则，如eat(),eatFood()
 // Java不采用ASCLL字符集，而是采用Unicode字符集。因此，这里的字母含义不仅仅是英文，还包括汉字等等。不建议使用汉字来定义标识符
public class Welcome{
    public static void main(String[] args){
        System.out.println("你好，yyy！");
    }
}