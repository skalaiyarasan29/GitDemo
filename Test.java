public class CommonMethods {
	CommonConfig configFile;

	public CommonMethods(CommonConfig config) {
		this.configFile=config;		
	}
	
	public String getEnv() {
		return configFile.getENV().toString();
	}
	
	public static String getValueFromExcel(HashMap<String,String>value, String colName) {
		String sList = null;
		for(String item:value.keySet()) {
			if(item.equals(colName)) {
				sList = value.get(item);
			}
		}
		return sList;
	}

}