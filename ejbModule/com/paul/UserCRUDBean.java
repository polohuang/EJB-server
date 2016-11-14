package com.paul;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.paul.model.User;

/**
 * Session Bean implementation class UserCRUDBean
 */
@Stateless
public class UserCRUDBean implements UserCRUD {

	@PersistenceContext(unitName = "EJB-User")
	private EntityManager entityManager;
	
//	@Resource(lookup = "java:/OracleDSJNDI")
//	private DataSource datasource;
//	private Connection con;
//	
//	private static final String INSERT = "INSERT INTO USERS u VALUES(?,?)";
//	private static final String DELETE = "DELETE FROM USERS u WHERE u.tel = ?";
//	private static final String UPDATE = "UPDATE USERS u SET u.name = ? WHERE u.tel = ?";
	/**
     * Default constructor. 
     */
    public UserCRUDBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addUser(User u) {
		entityManager.persist(u);
		
		/* DB connection */
//		try {
//			con = datasource.getConnection();
//			
//			PreparedStatement st = con.prepareStatement(INSERT);
//			st.setString(1, name);
//			st.setString(2, tel);
//			st.execute();
//			st.close();
//			con.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Override
	public void removeUser(String ID) {
		System.out.println("Delete:" + ID);
		User u = (User) entityManager.find(User.class, ID);
		entityManager.remove(u);
	}

	@Override
	public void updateUser(User u) {
		User user = (User) entityManager.find(User.class, u.getIDNumber());
		user.setName(u.getName());
		user.setPassword(u.getPassword());
		user.setGender(u.getGender());
		user.setAge(u.getAge());
		user.setCountry(u.getCountry());
		user.setAddress(u.getAddress());
		user.setEmail(u.getEmail());
		user.setTel(u.getTel());
		user.setNews(u.getNews());
	}

	@Override
	public List<User> findAll() {
		/* JPQL */
		List<User> users = entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
		return users;
	}

	@Override
	public User findOne(String tel) {
		User u = (User) entityManager.find(User.class, tel);
		return u;
	}

}
