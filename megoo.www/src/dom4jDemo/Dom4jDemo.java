package dom4jDemo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.xml.parsers.SAXParser;
import java.io.File;
import java.io.InputStream;
import java.util.List;


/**
 * 姓名: megoo74
 * 事件: 2021/11/14
 * 项目: Study-java
 */
public class Dom4jDemo {
    @Test
    public void parseXMLData() throws DocumentException {
//        创建一个 Dom4j的解析对象,代表了整个dom4j框架
        SAXReader saxReader = new SAXReader();
//        把xml文件加载到内存中成为一个Docment文档对象
//        Document document = saxReader.read(new File("src/books.xml"));
        InputStream is = Dom4jDemo.class.getResourceAsStream("/books.xml");
        Document document = saxReader.read(is);
        // 获取根元素
        Element root = document.getRootElement();
        System.out.println(root.getName());
        // 根元素的全部子元素
        List<Element> sonEles = root.elements();
        for (Element sonEle : sonEles) {
            System.out.println(sonEle.getName());
        }

    }
}
