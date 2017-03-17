package com.aorweb.mysqlapplication;

import java.io.Serializable;

/**
 * Created by got7 on 2/17/2017.
 */

public class TodoList implements Serializable{


        public int taskid;
        public String taskname;

        public String getTaskname() {
            return taskname;
        }

        public void setTaskname(String taskname) {
            this.taskname = taskname;
        }

        public int getTaskid() {
            return taskid;
        }

        public void setTaskid(int taskid) {
            this.taskid = taskid;
        }

    }



