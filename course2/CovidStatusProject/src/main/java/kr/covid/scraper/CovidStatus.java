package kr.covid.scraper;

import java.util.List;

public class CovidStatus {
    private String category; // 구분

    private List<Integer> weeklyPositiveCasesList; // 주간 양성자

    public CovidStatus() {
    }

    public CovidStatus(String category, List<Integer> weeklyPositiveCasesList) {
        this.category = category;
        this.weeklyPositiveCasesList = weeklyPositiveCasesList;
    }

    @Override
    public String toString() {
        return "CovidStatus{" +
                "category='" + category + '\'' +
                ", weeklyPositiveCasesList=" + weeklyPositiveCasesList +
                '}';
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Integer> getWeeklyPositiveCasesList() {
        return weeklyPositiveCasesList;
    }

    public void setWeeklyPositiveCasesList(List<Integer> weeklyPositiveCasesList) {
        this.weeklyPositiveCasesList = weeklyPositiveCasesList;
    }
}
