package Streams;

import Core.DataGenerator;
import Core.Enums.Gender;
import Core.Enums.Status;
import Core.Project;
import Core.User;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static List<Project> getListOfProject() {
        return DataGenerator.getProjects();
    }

    public static List<Project> getListOfProject(Status status) {
        return DataGenerator.getProjects().stream().filter(x -> x.getProjectStatus().equals(status)).collect(Collectors.toList());
    }

    public static List<Project> getListOfProject(User manager) {
        return DataGenerator.getProjects().stream().filter(x -> x.getAssignedManager() == manager).collect(Collectors.toList());
    }

    public static Project getProjectByProjectCode(String projectcode) {
        return DataGenerator.getProjects().stream().filter(x -> x.getProjectCode().equals(projectcode)).findFirst().get();
    }

    public static List<User> getListOfUsers() {
        return DataGenerator.getUsers();
    }

    public static User userByFirstName(String firstName) {
        return DataGenerator.getUsers().stream().filter(x ->x.getFirstName().equals(firstName)).findFirst().get();
    }

    public static String userByUserId(Long id) {
        User user = DataGenerator.getUsers().stream().filter(x -> x.getId() == id).findFirst().get();
        return user.getFirstName() + " " + user.getLastName();
    }

    public static List<User> deleteUser(String firstName) {
        return getListOfUsers().stream().filter(x -> x.getFirstName().equals(firstName) == false).collect(Collectors.toList());
    }


    //5 task

    public static List<Project> updateProjectStatus(Status old,Status current) {
        List<Project> updatedStatus = DataGenerator.getProjects().stream()
                .filter(x -> x.getProjectStatus().equals(old))
                .map(x -> {
                    x.setProjectStatus(current);
                    return x;
                }).collect(Collectors.toList());
        return updatedStatus;
    }

/*
    public static List<Project> updateProjectStatus(Status old,Status current) {
        List<Project> updatedStatus = DataGenerator.getProjects().stream()
                .filter(x -> x.getProjectStatus().equals(old))
                .peek(x -> x.setProjectStatus(current))
                .collect(Collectors.toList());
        return updatedStatus;
    }
 */

    public static List<Project> findProjectByManager(User manager){
        return DataGenerator.getProjects().stream()
                .filter(x -> x.getAssignedManager().equals(manager))
                .collect(Collectors.toList());
    }

    //Find projects that are created 4 days before or earlier and status is "IN_PROGRESS"
    public static List<Project> findprojectAccordingToDateAndStatus(){
        return DataGenerator.getProjects().stream()
                .filter(x->x.getProjectStatus().equals(Status.IN_PROGRESS)
                        && x.getStartDate().isBefore(LocalDate.now().minusDays(4)))
                .collect(Collectors.toList());
    }

    /*
    public static Integer totalProjectDurationForManager() {
        return DataGenerator.getProjects().stream()
                .filter(x -> x.getAssignedManager() == DataGenerator.manager1)
                .map(x -> Period.between(x.getStartDate(), x.getEndDate()).getDays())
                .reduce(0,Integer::sum);
    }
     */

    public static Integer totalProjectDurationForManager(User manager) {
        return DataGenerator.getProjects().stream()
                .filter(x -> x.getAssignedManager() == manager)
                .map(x -> Period.between(x.getStartDate(), x.getEndDate()).getDays())
                .reduce(0,(a,b) -> a+b);
    }

    //How many total male emplyee
    public static  long findTotalMaleInCompany(){
        return DataGenerator.getUsers().stream().filter(x->x.getGender().equals((Gender.MALE))).count();
    }
}
