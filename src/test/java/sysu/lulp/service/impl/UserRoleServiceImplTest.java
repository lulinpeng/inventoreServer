package sysu.lulp.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sysu.lulp.pojo.UserRole;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserRoleServiceImplTest {

    private final UserRoleServiceImpl userRoleService;

    @Autowired
    UserRoleServiceImplTest(UserRoleServiceImpl userRoleService) {
        this.userRoleService = userRoleService;
    }

    @Test
    void queryByUserId() {
        UserRole userRole = userRoleService.queryByUserId(1);
        System.out.println(userRole.getRoleId() + "  "  + userRole.getUserId());
    }
}