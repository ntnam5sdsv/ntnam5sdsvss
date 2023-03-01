package NguyenTheNam_Bai3;
import java.util.StringTokenizer;

public class VanBan {
	public String st;
//    public static final char SPACE = ' ';
//    public static final char TAB = '\t';
//    public static final char BREAK_LINE = '\n';
	public VanBan() {
		super();
	}

	public VanBan(String st) {
		super();
		this.st = st;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}
    public int countWords(String st) {
    	StringTokenizer stringTokenizer = new StringTokenizer(st);
        int tokenCount = stringTokenizer.countTokens();
        return tokenCount;
    }
//	public long numberWord() {
//		
//		long count=0;
//		for(int i=0; i<st.length(); i++) {
//			if(st.charAt(i)== SPACE || st.charAt(i)== TAB || st.charAt(i)== BREAK_LINE )
//			count++;
//		}
//		return count+1;
//	}
	// tieu chuan
    public String Standard (String st){
        st.trim();
        return st=st.replace("  "," ");
    }
	// viet hoa
	public String vietHoa() {
		String st1= st.toUpperCase();
		return st=st1;
	}
	// viet thuong
	public String vietThuong() {
		String st1= st.toLowerCase();
		return st=st1;
	}
	//viet hoa chu cai dau

	@Override
	public String toString() {
		return "VanBan [st=" + st + "]";
	}
	
	

}
