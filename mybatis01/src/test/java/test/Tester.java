package test;

import com.bjpowernode.mapper.CategoryMapper;
import com.bjpowernode.mapper.GoodsMapper;
import com.bjpowernode.domain.Category;
import com.bjpowernode.domain.Goods;
import com.bjpowernode.domain.User;
import com.bjpowernode.mapper.UserMapper;
import com.bjpowernode.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Tester {
    @Test
    public void testSave() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //链接的工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("张三");
        user.setPassword("123");
        sqlSession.update("user.save", user);
        sqlSession.commit();
    }

    @Test
    public void testSelect() throws Exception {
        /*String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //链接的工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = (User) sqlSession.selectOne("user.get", 2);
        System.out.println(user);*/
        /*UserDao userDao=new UserDaoImpl();
        User user=userDao.get(2);
        System.out.println(user);*/
    }

    @Test
    public void test01() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //链接的工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取连接
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //MyBatis根据接口生成代理类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.get(2);
        System.out.println(user);
        userMapper.save(user);
        sqlSession.commit();
    }

    @Test
    public void test02() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> uList = userMapper.getAll();
        System.out.println(uList);
    }

    @Test
    public void test03() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.save2("zhaoliu", "123");
        MyBatisUtils.commit();
        MyBatisUtils.release();
    }

    @Test
    public void test04() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getByName("liu");
        System.out.println(userList);
    }

    @Test
    public void test05() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("zhaoliu");
        List<User> userList = userMapper.getByUser(user);
        System.out.println(userList);
        MyBatisUtils.release();
    }

    @Test
    public void test06() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteBatch(new Integer[]{3, 4});
        MyBatisUtils.commit();
        MyBatisUtils.release();
    }

    @Test
    public void test07() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        Category category = categoryMapper.get(1);
        System.out.println(category.getGoodsList().size());
    }

    @Test
    public void test08() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
        Goods goods = goodsMapper.get(23);
        System.out.println(goods);
        System.out.println(goods.getCategory());
    }
    @Test
    public void test09() {
        SqlSession sqlSession = MyBatisUtils.openSession();
        CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        Category category = categoryMapper.get2(1);
        System.out.println(category);
        System.out.println(category.getGoodsList().size());
    }
    @Test
    public void test10() {
        SqlSession sqlSession = MyBatisUtils.openSession();
       GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
        Goods goods = goodsMapper.get2(23);
        System.out.println(goods);
        System.out.println(goods.getCategory());
    }
}
