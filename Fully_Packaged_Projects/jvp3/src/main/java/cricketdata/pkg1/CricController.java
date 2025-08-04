package cricketdata.pkg1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricController {
	@GetMapping("/batsman/getBest/{fname}")
	public static String getBestBatsman(@PathVariable String fname) throws IOException {
		List<String> player = new ArrayList<>();
		Set<String> set1 = new HashSet<>();
		List<String> temporary = new ArrayList<>();
		List<Integer> score = new ArrayList<>();
		List<Cricket> list1 = new ArrayList<>();
		List<Integer> totals = new ArrayList<>();
		Cricket cric1 = new Cricket();
		list1 = cric1.loadFile(fname);
		for(int i = 0; i<list1.size(); i++) {
			int temp1 = Integer.parseInt(list1.get(i).getData()[0]);
			score.add(temp1);
			player.add(list1.get(i).getData()[1]);
		}
		
		set1.addAll(player);
		temporary.addAll(set1);
		for(int j = 0; j<temporary.size();j++) {
			int temp2 = 0;
			for(int i = 0; i<score.size();i++) {
				if(temporary.get(j).equals(player.get(i))) {	
					temp2+=score.get(i);
				}
			}
			totals.add(temp2);
		}
		
		int max = Collections.max(totals);
		int pos = totals.indexOf(max);
		String highest = temporary.get(pos);
		System.out.println(highest);
		return "Best batsman is "+highest+" with a score of "+max;		
	}

}
