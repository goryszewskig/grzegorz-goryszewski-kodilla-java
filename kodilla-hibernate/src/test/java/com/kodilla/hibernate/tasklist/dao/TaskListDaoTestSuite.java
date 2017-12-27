package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String NAME = "shopping list";
    private static final String DESCRIPTION = "what to buy";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(NAME,DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readLists = taskListDao.findByListName(name);

        //Then
        Assert.assertEquals(1, readLists.size());
        Assert.assertEquals(DESCRIPTION, readLists.get(0).getDescription());

        //Cleanup
        int id = readLists.get(0).getId();
        taskListDao.delete(id);
    }


}
