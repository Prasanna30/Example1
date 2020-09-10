

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Map;
	import java.util.TreeMap;

	public class RomanToInt {
		
		public static List<String> sortRomanList(List<String> input){
			
			TreeMap<String, List<String>> m = new TreeMap<String, List<String>>();
			createMap(input, m);
			ArrayList<String> result = new ArrayList<String>();
			sortRomans(m, result);
			System.out.println(result);
			
			return new ArrayList<String>();
		}

		private static void sortRomans(TreeMap<String, List<String>> m, ArrayList<String> result) {
			for(Map.Entry<String, List<String>> e: m.entrySet()) {
				Collections.sort(e.getValue(), new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						return convertRoman(o1) - convertRoman(o2);
					}
				});
				for(String rom: e.getValue()) {
					result.add(e.getKey()+" " +rom);
				}
			}
		}

		private static void createMap(List<String> input, TreeMap<String, List<String>> m) {
			for(String v: input) {
				String[] val = v.split(" ");
				if(m.containsKey(val[0])) {
					m.get(val[0]).add(val[1]);
				}else {
					List<String> sn = new ArrayList<String>();
					sn.add(val[1]);
					m.put(val[0], sn);
				}
			}
		}
		
		public static int convertRoman(String romanNumber) {
			int result = 0;
			int prev =0;
			System.out.println(romanNumber);
			for(char c: romanNumber.toCharArray()) {
				int curr = 0;
				switch(c) {
				case 'I' : curr = 1; break;
				case 'V' : curr = 5; break;
				case 'X' : curr = 10; break;
				case 'L' : curr = 50; break;
				case 'C' : curr = 100; break;
				}
				if (curr <= prev) {
					result = result + curr;
				} else {
					if(result < curr) {
					result = curr - result;
					} else {
						result += curr - prev;
						result -= prev;
					}
						
				}
				prev = curr;
			}
			return result ;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			List<String> input = new ArrayList<String>();
			input.add("Zoey I");
			input.add("Zoey IX");
			input.add("Zoey XV");
			input.add("Adam II");
			input.add("Bob IV");
			sortRomanList(input);
			//System.out.println(convertRoman("CCLV"));
		}

}


