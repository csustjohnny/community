package life.majiang.community.mapper;

import life.majiang.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Lenovo
 */
@Mapper
public interface UserMapper {
    /**
     * add data to table
     * @param user the user to be added.
     */
    @Insert("Insert into user (name, account_id, token, gmt_create, gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

    @Select("Select * from user where token = #{token}")
    User findByToken(String token);
}
