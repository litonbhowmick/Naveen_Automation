package Demo;

    public class ExcelUtils {
//
//        @DataProvider(name = "excelDataProvider")
//        public static Object[][] getData(String filePath, String sheetName) {
//            List<HashMap<String, String>> dataList = new ArrayList<>();
//
//
//            try (FileInputStream fis = new FileInputStream(filePath);
//                 Workbook workbook = WorkbookFactory.create(fis)) {
//
//                Sheet sheet = workbook.getSheet(sheetName);
//                Row headerRow = sheet.getRow(0);
//                Object[][] dataArray = new Object[dataList.size()][1];
//                //[total size of the arraylist which is number of rows][only 1 column from that row which is HashMap]
//
//                for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//                    Row currentRow = sheet.getRow(i);
//                    HashMap<String, String> dataMap = new HashMap<>();
//
//                    for (int j = 0; j < headerRow.getLastCellNum(); j++) {
//                        String key = headerRow.getCell(j).getStringCellValue();
//                        String value = currentRow.getCell(j).getStringCellValue();
//                        dataMap.put(key, value);
//                    }
//
//                    dataArray[dataList.add(dataMap)][0];
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            return dataArray;
//        }
//    }
//
//    public static void main(String[] args) {
//        @Test(dataProvider = "excelDataProvider", dataProviderClass = ExcelUtils.class)
//        public void testExcelData(HashMap<String, String> data) {
//            // Example assertion
//            Assert.assertNotNull(data.get("ColumnName"), "ColumnName should not be null");
//            System.out.println("Data: " + data);
//        }
    }

