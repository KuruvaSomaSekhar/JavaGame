package com.practice;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadingXML {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		System.out.println("reading of xml started");
		
		File file = new File("D:/java/XML/Employee.xml");
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	
		DocumentBuilder db = dbf.newDocumentBuilder();
	Document doc = db.parse(file);
	doc.getDocumentElement().normalize();
	System.out.println("Root element " + doc.getDocumentElement().getNodeName());
	NodeList nodelist = doc.getElementsByTagName("employee");
	System.out.println("information about employees");
	for (int i = 0; i < nodelist.getLength(); i++) {
		Node node = nodelist.item(i);
		if (node.getNodeType()==node.ELEMENT_NODE) {
			Element nodeelement = (Element) node;
			NodeList nodeelementfist = nodeelement.getElementsByTagName("firstname");
		
			Element firstnum = (Element) nodeelementfist.item(0);
			NodeList nodenum = firstnum.getChildNodes();
			System.out.println("first name    " +nodenum.item(0).getNodeValue());
			NodeList nodelastelement = nodeelement.getElementsByTagName("lastname");
			
			Element lastnum = (Element) nodelastelement.item(0);
			NodeList lastnodenum = lastnum.getChildNodes();
			System.out.println("lastname    " +lastnodenum.item(0).getNodeValue());
			
		//	System.out.println(nodeelementfist+"@@@@@@@@@@    "+nodelastelement);
		}
		
	}
	}

}
