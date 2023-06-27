package in.nareshtech.batch18.codethons;

public class Contests {

    private String name;
    private String start;
    private String end;

    private String duration;
    private String contestURL;
    private String siteName;

    public Contests() {
        // Empty constructor
    }

    public Contests(String name, String start, String end, String duration, String contestURL, String siteName) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.duration = duration;
        this.contestURL = contestURL;
        this.siteName = siteName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getContestURL() {
        return contestURL;
    }

    public void setContestURL(String contestURL) {
        this.contestURL = contestURL;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }
}
