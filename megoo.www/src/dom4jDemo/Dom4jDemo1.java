package dom4jDemo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 姓名: megoo74
 * 事件: 2021/11/14
 * 项目: Study-java
 */
public class Dom4jDemo1 {
    @Test
    public void parseToList() throws DocumentException {
        // 导入框架
        //创建 Saxonreader对象
        SAXReader saxReader = new SAXReader();
        // 加载xml
        Document document =
                saxReader.read(Dom4jDemo1.class.getResourceAsStream("/books.xml"));
        // 拿根源是
        Element root = document.getRootElement();
        List<Element> bookEles = root.elements("book");
        // 准备容器,封装book
        List<Books> books = new ArrayList<>();
        // 遍历 book子元素
        for (Element bookEle : bookEles) {
//            System.out.println(bookEle.elementText("title"));
//            System.out.println(bookEle.elementText("author"));
//            System.out.println(bookEle.attributeValue("category"));
            Books book = new Books();
            book.setTitle(bookEle.elementText("title"));
            book.setAuthor(bookEle.elementText("author"));
            book.setYear(Integer.parseInt(bookEle.elementText("year")));
            book.setPrice(Double.parseDouble(bookEle.elementText("price")));
            book.setCategory(bookEle.attributeValue("category"));
            // book对象加入到 books数组
            books.add(book);
        }
        for (Books book : books) {
            System.out.println(book);
        }
    }
}
