package TestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xl_practice {

	
	
	public static String filename = "C:\\Users\\Girish\\Desktop\\Selenium_Data.xlsx";
    public  String path;
    public  FileInputStream fis = null;
    public  FileOutputStream fileOut =null;
    private static XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null ;
    private XSSFRow row   =null;
    private XSSFCell cell = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		xl_practice obj=new xl_practice();
	String value=	obj.getCellData("Docnu_Test_Data", "Patients", 1); 
		
	System.out.println(value);

	}
	  public String getCellData(String sheetName,String colName,int rowNum){
	        try{
	            if(rowNum <=0)
	                return "";

	            int index = workbook.getSheetIndex(sheetName);
	            
	            //System.out.println(index);
	            int col_Num=-1;
	            if(index==-1)
	                return "";

	            sheet = workbook.getSheetAt(index);
	            row=sheet.getRow(0);
	            for(int i=0;i<row.getLastCellNum();i++){
	                //System.out.println(row.getCell(i).getStringCellValue().trim());
	                if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
	                    col_Num=i;
	            }
	            if(col_Num==-1)
	                return "";

	            sheet = workbook.getSheetAt(index);
	            row = sheet.getRow(rowNum-1);
	            if(row==null)
	                return "";
	            cell = row.getCell(col_Num);

	            if(cell==null)
	                return "";
	            //System.out.println(cell.getCellType());
	            if(cell.getCellType()==CellType.STRING)
	                return cell.getStringCellValue();
	            else if(cell.getCellType()==CellType.NUMERIC || cell.getCellType()==CellType.FORMULA ){

	                String cellText  = String.valueOf(cell.getNumericCellValue());
	                if (HSSFDateUtil.isCellDateFormatted(cell)) {
	                    // format in form of M/D/YY
	                    double d = cell.getNumericCellValue();

	                    Calendar cal =Calendar.getInstance();
	                    cal.setTime(HSSFDateUtil.getJavaDate(d));
	                    cellText =
	                            (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
	                    cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" +
	                            cal.get(Calendar.MONTH)+1 + "/" +
	                            cellText;

	                    //System.out.println(cellText);

	                }



	                return cellText;
	            }else if(cell.getCellType()==CellType.BLANK)
	                return "";
	            else
	                return String.valueOf(cell.getBooleanCellValue());

	        }
	        catch(Exception e){

	            e.printStackTrace();
	            return "row "+rowNum+" or column "+colName +" does not exist in xls";
	        }
	    }

}
