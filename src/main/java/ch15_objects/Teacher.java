package ch15_objects;

import java.util.Objects;

public class Teacher {
        private  String name;
        private String school;


        public Teacher(String name, String school) {
            this.name = name;
            this.school = school;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            ch15_objects.teachers.Teacher teacher = (ch15_objects.teachers.Teacher) o;
            return Objects.equals(name, teacher.name) && Objects.equals(school, teacher.school);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, school);
        }

        @Override
        public String toString() {
            return name + "선생님의 근무지는 " +
                    school + "학원입니다.";
        }

    }
