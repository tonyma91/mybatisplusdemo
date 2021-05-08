package com.laoma.mybatisdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laoma.mybatisdemo.bean.AdAction;
import com.laoma.mybatisdemo.mapper.AdActionMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = {MybatisApplication.class, MybatisApplicationTests.class})
@RunWith(SpringRunner.class)
class MybatisApplicationTests {

    @Autowired
   private AdActionMapper adActionMapper;

    //会打印电脑的用户名字 mi 应该是预留的关键字，即使没有进行申明都会有的
    @Value("${username}")
    private String username;

    @Value("${time}")
    private String time;

    //获取配置的自己的姓名
    @Value("${myName}")
    String majinming;

    //测试是否能有多个配置文件//事实证明不行
//    @Value("${application-dev.properties.devValue}")
//    String devValue;

    //不加$，就相当于进行了一个赋值
    @Value("tonyma")
    String tonyma;
    /**
     * 测试数据库逆向的 XML文件
     */
    @Test
    public void getareaInformation() {
        AdAction adAction = new AdAction();
//		adAction.setId(2);
        adAction.setActionName("2222");
        adAction.setActionNote("1223");
        //plus插入
//		int i = adActionMapper.insert(adAction);
        //xml 插入
//        int i1 = adActionMapper.insertSelective(adAction);

        //无条件查询，仅用于测试
//		List<AdAction> actionList = adActionMapper.selectList(new QueryWrapper<AdAction>());
        //复杂查询，时间倒叙，查询前十条
        QueryWrapper<AdAction> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("create_time");
        queryWrapper.last("limit 0,5");
        List<AdAction> actionList = adActionMapper.selectList(queryWrapper);

        System.out.println(username);

        System.out.println( time );

        System.out.println( majinming );

        System.out.println(tonyma);

    }

}
