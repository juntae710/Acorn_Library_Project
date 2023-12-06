package 프로젝트2차ver2;

public class 정렬메서드 {
	
	public static void sort(Object[] obj) {
		for(int i = 0; i<obj.length-1; i++) {
			for(int j = i+1; j < obj.length; j++) {
				InfoCompare m = (InfoCompare) obj[i];
				if(m.compareTo(obj[j])>0) {
					Object tmp;
					tmp = obj[i];
					obj[i] = obj[j];
					obj[j] = tmp;
				}
			}
		}
	}
}

