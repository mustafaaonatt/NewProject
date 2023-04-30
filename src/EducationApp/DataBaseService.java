package EducationApp;

import EducationApp.Util.DataBaseUtil;
import EducationApp.Util.QueryUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseService {
    private DataBaseUtil dbu =new DataBaseUtil();
    private QueryUtil qu =new QueryUtil();

    public void addStd(Student std) throws SQLException{
        try(Connection cn = dbu.connect();
            PreparedStatement ps = cn.prepareStatement(qu.addStd())) {
            ps.setString(1, std.getfName());
            ps.setString(2, std.getlName());
            ps.setString(3, std.getGender());
            ps.setDate(4, std.getDob());
            int check = ps.executeUpdate();
            if (check > 0){
                System.out.println("Student entered to system Successfully. \n");
            }else {
                System.out.println("Student was not able to entered to system \n");
            }

        }
    }
}
