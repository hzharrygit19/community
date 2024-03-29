package life.majiang.community.community.mapper;

import life.majiang.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_creat,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

}
