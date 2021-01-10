package _05collection._3map._1demo1;

import java.util.*;

/**
 * 标题: Map 案例一
 *
 * @Author: Jiang
 * @Date: 2020/12/24 9:21
 */
public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String, String> animal = new HashMap<>();
        System.out.println("请输入三组单词对应的注释,并存放到HashMap中");
        Scanner console = new Scanner(System.in);
        //添加数据
        int i = 0;
        while (i < 3) {
            System.out.println("请输入key值(单词):");
            String key = console.next();
            System.out.println("请输入value值(单词):");
            String value = console.next();
            animal.put(key, value);
            i++;
        }
        //打印输出value的值
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("使用迭代器输出所有的value");
        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "   ");
        }
        //打印输出key-value的值
        System.out.println("*******************************");
        //通过entrySet方法得到key-value
        System.out.println("通过entrySet方法得到key-value:");
        Set<Map.Entry<String,String>> entrySet = animal.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.print(entry.getKey()+ "-");
            System.out.println(entry.getValue());
        }
        System.out.println("*******************************");
        //通过单词找到注释并输出
        //使用keySet方法
        System.out.println("请输入要找到的单词:");
        String strSearch = console.next();
        //取得keySet
        Set<String> keySet = animal.keySet();
        //遍历keySet
        for (String key : keySet) {
            if (strSearch.equals(key)) {
                System.out.println("找到了!键值对为:"+key+"-"+animal.get(key));
                break;
            }
        }
    }
}
