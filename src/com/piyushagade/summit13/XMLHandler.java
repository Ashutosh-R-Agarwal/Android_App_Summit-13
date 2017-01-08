package com.piyushagade.summit13;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLHandler extends DefaultHandler{
	XMLData info = new XMLData();
	
	public String getInformation(){
		return info.dataToString();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		 if(localName.equals("temp")){
			
			// If New Update
			String updatehead = attributes.getValue("data");
					info.setUpdateHead(updatehead);
					
				
			
		}
	}
	

}
