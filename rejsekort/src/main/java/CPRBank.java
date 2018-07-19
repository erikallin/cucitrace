import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CPRBank {
	private List<String> DATABASE_CPR_NUMBERRS;
	private List<int[]> DATABASE_CC_NUMBERRS;

	private static final String[] DB_CPR_NUMBERRS = { "1012921234", "1012921234", "1012921234", "1012921234",
			"1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234", "1012921234",
			"1012921234" };

	private static final int[] DB_CC_NUMBERS = { 1234, 123, 123, 123, 21321, 2432 };

	public CPRBank() {
		DATABASE_CPR_NUMBERRS = new ArrayList<String>();
		DATABASE_CC_NUMBERRS = new ArrayList<int[]>();
		DATABASE_CC_NUMBERRS = Arrays.asList(DB_CC_NUMBERS);
		DATABASE_CPR_NUMBERRS = Arrays.asList(DB_CPR_NUMBERRS);
	}

	public List<int[]> getDATABASE_CC_NUMBERRS() {
		return DATABASE_CC_NUMBERRS;
	}

	public void setDATABASE_CC_NUMBERRS(List<int[]> dATABASE_CC_NUMBERRS) {
		DATABASE_CC_NUMBERRS = dATABASE_CC_NUMBERRS;
	}

	public List<String> getDATABASE_CPR_NUMBERRS() {
		return DATABASE_CPR_NUMBERRS;
	}

	public void setDATABASE_CPR_NUMBERRS(ArrayList<String> dATABASE_CPR_NUMBERRS) {
		DATABASE_CPR_NUMBERRS = dATABASE_CPR_NUMBERRS;
	}
	
	public ResponseObject exist(String cpr, int cc){
		ResponseObject response;
		if (DATABASE_CC_NUMBERRS.contains(cc)&& (DATABASE_CPR_NUMBERRS.contains(cpr))) {
			return response = new ResponseObject(180, "");
		} else {

			response = new ResponseObject(182, "travel card not created");
		}
		return response;

	}

}
