package springtest;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/config/*.xml"})
public class MySQLConnectionTest {

/*		@Inject
		private DataSource ds;
		
		@Test
		public void testConnection() {
			try(Connection conn = ds.getConnection()){
				System.out.println("con==="+conn);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}*/
	
	  @Inject
	    private SqlSessionFactory sqlFactory;
	     
	    @Test
	    public void testFactory(){
	        System.out.println(sqlFactory);
	    }
	     
	    @Test
	    public void testSession() throws Exception{
	        try(SqlSession session = sqlFactory.openSession()){
	            System.out.println(session);
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	    }


}
