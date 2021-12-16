package org.czw.flight.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.czw.flight.model.AdminRole;
import org.czw.flight.model.AdminRoleExample;

public interface AdminRoleMapper {
    long countByExample(AdminRoleExample example);

    int deleteByExample(AdminRoleExample example);

    int insert(AdminRole record);

    int insertSelective(AdminRole record);

    List<AdminRole> selectByExample(AdminRoleExample example);

    int updateByExampleSelective(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    int updateByExample(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);
}