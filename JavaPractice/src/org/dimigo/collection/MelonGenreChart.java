//
//  MelonGenreChart.java
//  org.dimigo.collection
//
//  Created by 정에녹 on 2015. 9. 30..
//  Copyright (c) 2015년 Enoch-Jung. All rights reserved.
//

package org.dimigo.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class MelonGenreChart {

	public static void main(String[] args) {

		Map<String, List<Music>> map = new HashMap<>();
		
		List<Music> ballad = new ArrayList<>();
		ballad.add(new Music("내 첫사랑", "베리굿"));
		ballad.add(new Music("또 다시 사랑", "임창정"));
		ballad.add(new Music("부산에 가면", "박진영"));
		map.put("발라드", ballad);

		List<Music> dance = new ArrayList<>();
		dance.add(new Music("커피", "유재환,김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		map.put("댄스", dance);
		
		//////////////////////////////////////////////////
		
		System.out.println("-------- << 멜론 장르별 챠트 >> --------");
		printMap(map);
		
		System.out.println("-------- << 발라드 3위 곡 변경 >> --------");
		map.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		
		System.out.println("-------- << 발라드 1위 곡 삭제 >> --------");
		map.get("발라드").remove(0);
		printMap(map);
		
		System.out.println("-------- << 전체 리스트 삭제 >> --------");
		map.clear();
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		
		List<Music> list = null;
		
		for(String key : map.keySet()) {
			System.out.println("["+key+"]");

			list = map.get(key);
			for(int i=0; i<list.size(); i++)
				System.out.println((i+1)+". "+list.get(i).toString());
		}
		System.out.println();
		
	}

}
