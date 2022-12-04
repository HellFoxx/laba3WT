package hellfoxx.server.DataAccessLayer;

import hellfoxx.server.DataAccessLayer.BookDao.BookDao;
import hellfoxx.server.DataAccessLayer.UserDao.UserDao;

public class DaoFactory {
	
	
	private static UserDao userDao = new UserDao();
	
    private static BookDao bookDao = new BookDao();

    public static UserDao getUserDao()
    {
    	return userDao;
    }
    

    public static BookDao getBookDao()
    {
    	return bookDao;
    }
}
