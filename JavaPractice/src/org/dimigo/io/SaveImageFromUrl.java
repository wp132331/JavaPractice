//
//  SaveImageFromUrl.java
//  org.dimigo.io
//
//  Created by 정에녹 on 2015. 10. 26..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.io;

import java.io.*;
import java.net.*;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		
		String imageUrl = "http://img.naver.net/static/www/u/2013/0731/nmms_224940510.gif";

		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")) {
				
				int result;
				
				byte[] buf = new byte[100];
				while((result = is.read(buf)) != -1)
					os.write(buf, 0, result);
				
				System.out.println("파일 생성 완료");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
