import app.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;

public class CalculationTest {
    @Test
    public void testCalculation(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculation.divide(1,0);
        });
    }
    @Test
    public void testCalculation2(){
        Assertions.assertEquals(1,Calculation.add(1,0));
    }

//    @Test
//        // ... (Giữ nguyên các test case cũ của bạn) ...
//        public void testFilePath_Hardcoded_WillFailOnWindows() {
//            String folder = "src";
//            String file = "main";
//
//            // Cố tình dùng dấu gạch chéo của Linux/macOS
//            String pathString = folder + "/" + file;
//            File fileObj = new File(pathString);
//
//            // Hàm getPath() sẽ chuyển đổi đường dẫn theo HĐH đang chạy:
//            // - Linux/macOS: trả về "src/main" (Khớp -> Test Xanh)
//            // - Windows: trả về "src\main" (Không khớp -> Test Đỏ)
//        Assertions.assertEquals("src/main", fileObj.getPath());
//        }
}
