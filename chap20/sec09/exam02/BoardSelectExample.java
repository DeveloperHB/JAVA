package chap20.sec09.exam02;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Blob;

public class BoardSelectExample {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // JDBC 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 연결하기
            conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/thisisjava",
                            "root",
                            "1234"
                    );
            
            // SQL
            String sql = "" +
                "select bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata " +
                "from boards " +  // 수정: 공백 추가
                "where bwriter=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Board board = new Board();
                board.setBno(rs.getInt("bno"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                board.setBfilename(rs.getString("bfilename"));
                board.setBfiledata(rs.getBlob("bfiledata"));
                
                System.out.println(board);
                
                Blob blob = board.getBfiledata();
                if (blob != null) {
                    InputStream is = blob.getBinaryStream();
                    OutputStream os = new FileOutputStream("C:/Temp/" + board.getBfilename()); // 수정: 슬래시 추가
                    is.transferTo(os); // 파일 저장
                    os.flush();
                    os.close();
                    is.close();
                }
            }
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}