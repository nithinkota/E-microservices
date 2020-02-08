package com.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class User {
	
		
		private String userID;
		private long nearbySize;
	    private String user_Name;
	    private String user_Selected_Languageid;
	    private String user_Email;
	    private String user_Password;
	    private String user_Mobileno;
	    private String user_Opt;
	    private String user_Nationality;
	    private String user_Countryofresidence;
	    private String user_Stateofresidence;
	    private String user_Cityofresidence;	
	    private ArrayList<String> user_Cityofresidencelist;
	    private ArrayList<String> user_Cityofresidencelistname;
	    private String user_occupationname;
	    private String user_occupationid;
	    private  ArrayList<String> user_occupationlist;
	    private  ArrayList<String> user_occupationlistname;
	    private ArrayList<String> user_Languages;
	    private ArrayList<String> user_Languagesname;
	    private ArrayList<String> user_hobbies;
	    private ArrayList<String> user_hobbiesnamelist;
	    private String user_hobbiesid;
	    private String user_hobbiesname;
	    private int user_Age;
	    private ArrayList<Integer> user_Agelist;
	    private String user_Gender;
	    private ArrayList<String> user_Genderlist;
	    private String user_Signup_Status;
	    private String user_Optgentrated_Time;
	    private String user_Optvalid_Time;
	    
	    private Date date;
	    private long milli;
	    private long filterUserListCount;
	    
	    
	    
	    public long getFilterUserListCount() {
			return filterUserListCount;
		}
		public void setFilterUserListCount(long filterUserListCount) {
			this.filterUserListCount = filterUserListCount;
		}
		public long getMilli() {
			return milli;
		}
		public void setMilli(long milli) {
			this.milli = milli;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		//newwwwwwwwwwwww//
	    private String user_Bio;
	    private ArrayList<String> user_Workststuslist;
	    private ArrayList<String> user_Workststusnamelist;
	    private String user_profilephotoid;
	    private String user_profilephoto_Url;
	    private MultipartFile  introductionvideofile;
	    private String user_Introductionvideo_Name;
	    private String user_Introductionvideoid;
	    private String user_Introductionvideo_Ulr;
	    private double introductionvideo_duriation;
	    private int introductionvideo_Nolike;
	    private int introductionvideo_Numberofview;
	    private ArrayList<String> user_joblist;
	    private ArrayList<String> user_joblistname;
	    private String user_job;
	    private String job_Fromdate;
	    private String job_Todate;
	    private String job_Status;
	    private String job_Company;
	    private String job_Role;
	    private ArrayList<String> user_Galaryphotolist;
	    private String user_Galaryphotoid;
	    private String user_Galaryphoto_Url;
	    private ArrayList<String> user_Certificationlist;
	    private ArrayList<String> user_Certificationlistname;
	    private String user_Certificationname;
	    private String user_CertificationYear;
	    private ArrayList<String> user_Skilllist;
	    private ArrayList<String> user_Skilllistname;
	    private String user_Skillname;
	    private String user_Skillid;
	    private String skill_Description;
	    private String skill_Photoid;
	    private String skill_Photo_Url;
	    private int skill_Noofendorsement;
	    private String user_Unfollow;
	    private String user_Report;
	    private String user_Block;
	    private String user_Membership_Type;   
	    private String userjabberID;
		private String planID;
		private String planname;
		
		 private Object skills;
		
		
		////mounika attributes
		
		
		public Object getSkills() {
			return skills;
		}
		public void setSkills(Object object) {
			this.skills = object;
		}
		private String friend_ID;
	    private String friend_Name;
	    private String request_Status;
	    private String friend_Reqid;
	    private String location_Status;
	    private ArrayList<String> friendlists;
	    private ArrayList<String> skill_GalleryLists;
	    private int connection_Count;
	    
	    
	    
	
		
		public long getNearbySize() {
			return nearbySize;
		}
		public void setNearbySize(long nearbySize) {
			this.nearbySize = nearbySize;
		}
		public int getConnection_Count() {
			return connection_Count;
		}
		public void setConnection_Count(int connection_Count) {
			this.connection_Count = connection_Count;
		}
		public String getLocation_Status() {
			return location_Status;
		}
		public void setLocation_Status(String location_Status) {
			this.location_Status = location_Status;
		}
		public ArrayList<String> getSkill_GalleryLists() {
			return skill_GalleryLists;
		}
		public void setSkill_GalleryLists(ArrayList<String> skill_GalleryLists) {
			this.skill_GalleryLists = skill_GalleryLists;
		}
		private String skillID;
		private String skillname;
	    public String getSkillID() {
			return skillID;
		}
		public void setSkillID(String skillID) {
			this.skillID = skillID;
		}
		public String getSkillname() {
			return skillname;
		}
		public void setSkillname(String skillname) {
			this.skillname = skillname;
		}
		/////nithin attributes
	    private ArrayList<String>  blocklist;
	    private String whom_userID;
	    
	    private long recommendation_count;
	    private String latitude;
	    private String longitude;
	    private double distance;
	    private int pagination_number;
	    private String friend_status;
	    private ArrayList<String> loc;    
		
	    
	    
		
		public ArrayList<String> getLoc() {
			return loc;
		}
		public void setLoc(ArrayList<String> loc) {
			this.loc = loc;
		}
		public String getFriend_status() {
			return friend_status;
		}
		public void setFriend_status(String friend_status) {
			this.friend_status = friend_status;
		}
		public int getPagination_number() {
			return pagination_number;
		}
		public void setPagination_number(int pagination_number) {
			this.pagination_number = pagination_number;
		}
		public double getDistance() {
			return distance;
		}
		public double setDistance(double distance) {
			return this.distance = distance;
		}
		public String getLatitude() {
			return latitude;
		}
		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}
		public String getLongitude() {
			return longitude;
		}
		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}
		public ArrayList<String> getBlocklist() {
			return blocklist;
		}
		public void setBlocklist(ArrayList<String> blocklist) {
			this.blocklist = blocklist;
		}
		public String getWhom_userID() {
			return whom_userID;
		}
		public void setWhom_userID(String whom_userID) {
			this.whom_userID = whom_userID;
		}
		public long getRecommendation_count() {
			return recommendation_count;
		}
		public void setRecommendation_count(long recommendation_count) {
			this.recommendation_count = recommendation_count;
		}
		public String getFriend_ID() {
			return friend_ID;
		}
		public void setFriend_ID(String friend_ID) {
			this.friend_ID = friend_ID;
		}
		public String getFriend_Name() {
			return friend_Name;
		}
		public void setFriend_Name(String friend_Name) {
			this.friend_Name = friend_Name;
		}
		public String getRequest_Status() {
			return request_Status;
		}
		public void setRequest_Status(String request_Status) {
			this.request_Status = request_Status;
		}
		public String getFriend_Reqid() {
			return friend_Reqid;
		}
		public void setFriend_Reqid(String friend_Reqid) {
			this.friend_Reqid = friend_Reqid;
		}
		public ArrayList<String> getFriendlists() {
			return friendlists;
		}
		public void setFriendlists(ArrayList<String> friendlists) {
			this.friendlists = friendlists;
		}
		public ArrayList<String> getUser_Cityofresidencelistname() {
			return user_Cityofresidencelistname;
		}
		public void setUser_Cityofresidencelistname(ArrayList<String> user_Cityofresidencelistname) {
			this.user_Cityofresidencelistname = user_Cityofresidencelistname;
		}
		public ArrayList<String> getUser_occupationlistname() {
			return user_occupationlistname;
		}
		public void setUser_occupationlistname(ArrayList<String> user_occupationlistname) {
			this.user_occupationlistname = user_occupationlistname;
		}
		public ArrayList<String> getUser_Languagesname() {
			return user_Languagesname;
		}
		public void setUser_Languagesname(ArrayList<String> user_Languagesname) {
			this.user_Languagesname = user_Languagesname;
		}
		public ArrayList<String> getUser_hobbiesnamelist() {
			return user_hobbiesnamelist;
		}
		public void setUser_hobbiesnamelist(ArrayList<String> user_hobbiesnamelist) {
			this.user_hobbiesnamelist = user_hobbiesnamelist;
		}
		public ArrayList<String> getUser_joblistname() {
			return user_joblistname;
		}
		public void setUser_joblistname(ArrayList<String> user_joblistname) {
			this.user_joblistname = user_joblistname;
		}
		public ArrayList<String> getUser_Certificationlistname() {
			return user_Certificationlistname;
		}
		public void setUser_Certificationlistname(ArrayList<String> user_Certificationlistname) {
			this.user_Certificationlistname = user_Certificationlistname;
		}
		public ArrayList<String> getUser_Skilllistname() {
			return user_Skilllistname;
		}
		public void setUser_Skilllistname(ArrayList<String> user_Skilllistname) {
			this.user_Skilllistname = user_Skilllistname;
		}
		public String getUserID() {
			return userID;
		}
		public void setUserID(String userID) {
			this.userID = userID;
		}
		public String getUser_Name() {
			return user_Name;
		}
		public void setUser_Name(String user_Name) {
			this.user_Name = user_Name;
		}
		public String getUser_Selected_Languageid() {
			return user_Selected_Languageid;
		}
		public void setUser_Selected_Languageid(String user_Selected_Languageid) {
			this.user_Selected_Languageid = user_Selected_Languageid;
		}
		public String getUser_Email() {
			return user_Email;
		}
		public void setUser_Email(String user_Email) {
			this.user_Email = user_Email;
		}
		public String getUser_Password() {
			return user_Password;
		}
		public void setUser_Password(String user_Password) {
			this.user_Password = user_Password;
		}
		public String getUser_Mobileno() {
			return user_Mobileno;
		}
		public void setUser_Mobileno(String user_Mobileno) {
			this.user_Mobileno = user_Mobileno;
		}
		public String getUser_Opt() {
			return user_Opt;
		}
		public void setUser_Opt(String user_Opt) {
			this.user_Opt = user_Opt;
		}
		public String getUser_Nationality() {
			return user_Nationality;
		}
		public void setUser_Nationality(String user_Nationality) {
			this.user_Nationality = user_Nationality;
		}
		public String getUser_Countryofresidence() {
			return user_Countryofresidence;
		}
		public void setUser_Countryofresidence(String user_Countryofresidence) {
			this.user_Countryofresidence = user_Countryofresidence;
		}
		public String getUser_Stateofresidence() {
			return user_Stateofresidence;
		}
		public void setUser_Stateofresidence(String user_Stateofresidence) {
			this.user_Stateofresidence = user_Stateofresidence;
		}
		public String getUser_Cityofresidence() {
			return user_Cityofresidence;
		}
		public void setUser_Cityofresidence(String user_Cityofresidence) {
			this.user_Cityofresidence = user_Cityofresidence;
		}
		public ArrayList<String> getUser_Languages() {
			return user_Languages;
		}
		public void setUser_Languages(ArrayList<String> user_Languages) {
			this.user_Languages = user_Languages;
		}
		public ArrayList<String> getUser_hobbies() {
			return user_hobbies;
		}
		public void setUser_hobbies(ArrayList<String> user_hobbies) {
			this.user_hobbies = user_hobbies;
		}
		public int getUser_Age() {
			return user_Age;
		}
		public void setUser_Age(int user_Age) {
			this.user_Age = user_Age;
		}
		public String getUser_Gender() {
			return user_Gender;
		}
		public void setUser_Gender(String user_Gender) {
			this.user_Gender = user_Gender;
		}
		public String getUser_Signup_Status() {
			return user_Signup_Status;
		}
		public void setUser_Signup_Status(String user_Signup_Status) {
			this.user_Signup_Status = user_Signup_Status;
		}
		public String getUser_Optgentrated_Time() {
			return user_Optgentrated_Time;
		}
		public void setUser_Optgentrated_Time(String user_Optgentrated_Time) {
			this.user_Optgentrated_Time = user_Optgentrated_Time;
		}
		public String getUser_Optvalid_Time() {
			return user_Optvalid_Time;
		}
		public void setUser_Optvalid_Time(String user_Optvalid_Time) {
			this.user_Optvalid_Time = user_Optvalid_Time;
		}
		public String getUser_Bio() {
			return user_Bio;
		}
		public void setUser_Bio(String user_Bio) {
			this.user_Bio = user_Bio;
		}

		public ArrayList<String> getUser_Workststuslist() {
			return user_Workststuslist;
		}
		public void setUser_Workststuslist(ArrayList<String> user_Workststuslist) {
			this.user_Workststuslist = user_Workststuslist;
		}
		public String getUser_profilephotoid() {
			return user_profilephotoid;
		}
		public void setUser_profilephotoid(String user_profilephotoid) {
			this.user_profilephotoid = user_profilephotoid;
		}
		public String getUser_profilephoto_Url() {
			return user_profilephoto_Url;
		}
		public void setUser_profilephoto_Url(String user_profilephoto_Url) {
			this.user_profilephoto_Url = user_profilephoto_Url;
		}
		public String getUser_Introductionvideoid() {
			return user_Introductionvideoid;
		}
		public void setUser_Introductionvideoid(String user_Introductionvideoid) {
			this.user_Introductionvideoid = user_Introductionvideoid;
		}
		public String getUser_Introductionvideo_Ulr() {
			return user_Introductionvideo_Ulr;
		}
		public void setUser_Introductionvideo_Ulr(String user_Introductionvideo_Ulr) {
			this.user_Introductionvideo_Ulr = user_Introductionvideo_Ulr;
		}
		public double getIntroductionvideo_duriation() {
			return introductionvideo_duriation;
		}
		public void setIntroductionvideo_duriation(double introductionvideo_duriation) {
			this.introductionvideo_duriation = introductionvideo_duriation;
		}
		public int getIntroductionvideo_Nolike() {
			return introductionvideo_Nolike;
		}
		public void setIntroductionvideo_Nolike(int introductionvideo_Nolike) {
			this.introductionvideo_Nolike = introductionvideo_Nolike;
		}
		public int getIntroductionvideo_Numberofview() {
			return introductionvideo_Numberofview;
		}
		public void setIntroductionvideo_Numberofview(int introductionvideo_Numberofview) {
			this.introductionvideo_Numberofview = introductionvideo_Numberofview;
		}
		public ArrayList<String> getUser_joblist() {
			return user_joblist;
		}
		public void setUser_joblist(ArrayList<String> user_joblist) {
			this.user_joblist = user_joblist;
		}
		public String getUser_job() {
			return user_job;
		}
		public void setUser_job(String user_job) {
			this.user_job = user_job;
		}
		public String getJob_Fromdate() {
			return job_Fromdate;
		}
		public void setJob_Fromdate(String job_Fromdate) {
			this.job_Fromdate = job_Fromdate;
		}
		public String getJob_Todate() {
			return job_Todate;
		}
		public void setJob_Todate(String job_Todate) {
			this.job_Todate = job_Todate;
		}
		public String getJob_Status() {
			return job_Status;
		}
		public void setJob_Status(String job_Status) {
			this.job_Status = job_Status;
		}
		public String getJob_Company() {
			return job_Company;
		}
		public void setJob_Company(String job_Company) {
			this.job_Company = job_Company;
		}
		public String getJob_Role() {
			return job_Role;
		}
		public void setJob_Role(String job_Role) {
			this.job_Role = job_Role;
		}
		public ArrayList<String> getUser_Galaryphotolist() {
			return user_Galaryphotolist;
		}
		public void setUser_Galaryphotolist(ArrayList<String> user_Galaryphotolist) {
			this.user_Galaryphotolist = user_Galaryphotolist;
		}
		public String getUser_Galaryphotoid() {
			return user_Galaryphotoid;
		}
		public void setUser_Galaryphotoid(String user_Galaryphotoid) {
			this.user_Galaryphotoid = user_Galaryphotoid;
		}
		public String getUser_Galaryphoto_Url() {
			return user_Galaryphoto_Url;
		}
		public void setUser_Galaryphoto_Url(String user_Galaryphoto_Url) {
			this.user_Galaryphoto_Url = user_Galaryphoto_Url;
		}
		public ArrayList<String> getUser_Certificationlist() {
			return user_Certificationlist;
		}
		public void setUser_Certificationlist(ArrayList<String> user_Certificationlist) {
			this.user_Certificationlist = user_Certificationlist;
		}
		public String getUser_Certificationname() {
			return user_Certificationname;
		}
		public void setUser_Certificationname(String user_Certificationname) {
			this.user_Certificationname = user_Certificationname;
		}
		public String getUser_CertificationYear() {
			return user_CertificationYear;
		}
		public void setUser_CertificationYear(String user_CertificationYear) {
			this.user_CertificationYear = user_CertificationYear;
		}
		public ArrayList<String> getUser_Skilllist() {
			return user_Skilllist;
		}
		public void setUser_Skilllist(ArrayList<String> user_Skilllist) {
			this.user_Skilllist = user_Skilllist;
		}
		
		public String getUser_Skillname() {
			return user_Skillname;
		}
		public void setUser_Skillname(String user_Skillname) {
			this.user_Skillname = user_Skillname;
		}
		public String getUser_Skillid() {
			return user_Skillid;
		}
		public void setUser_Skillid(String user_Skillid) {
			this.user_Skillid = user_Skillid;
		}
		public String getSkill_Description() {
			return skill_Description;
		}
		public void setSkill_Description(String skill_Description) {
			this.skill_Description = skill_Description;
		}
		public String getSkill_Photoid() {
			return skill_Photoid;
		}
		public void setSkill_Photoid(String skill_Photoid) {
			this.skill_Photoid = skill_Photoid;
		}
		public String getSkill_Photo_Url() {
			return skill_Photo_Url;
		}
		public void setSkill_Photo_Url(String skill_Photo_Url) {
			this.skill_Photo_Url = skill_Photo_Url;
		}
		public int getSkill_Noofendorsement() {
			return skill_Noofendorsement;
		}
		public void setSkill_Noofendorsement(int skill_Noofendorsement) {
			this.skill_Noofendorsement = skill_Noofendorsement;
		}
		public String getUser_Unfollow() {
			return user_Unfollow;
		}
		public void setUser_Unfollow(String user_Unfollow) {
			this.user_Unfollow = user_Unfollow;
		}
		public String getUser_Report() {
			return user_Report;
		}
		public void setUser_Report(String user_Report) {
			this.user_Report = user_Report;
		}
		public String getUser_Block() {
			return user_Block;
		}
		public void setUser_Block(String user_Block) {
			this.user_Block = user_Block;
		}
		public String getUser_Membership_Type() {
			return user_Membership_Type;
		}
		public void setUser_Membership_Type(String user_Membership_Type) {
			this.user_Membership_Type = user_Membership_Type;
		}
		public String getUserjabberID() {
			return userjabberID;
		}
		public void setUserjabberID(String userjabberID) {
			this.userjabberID = userjabberID;
		}
		public ArrayList<String> getUser_Cityofresidencelist() {
			return user_Cityofresidencelist;
		}
		public void setUser_Cityofresidencelist(ArrayList<String> user_Cityofresidencelist) {
			this.user_Cityofresidencelist = user_Cityofresidencelist;
		}
		public ArrayList<Integer> getUser_Agelist() {
			return user_Agelist;
		}
		public void setUser_Agelist(ArrayList<Integer> user_Agelist) {
			this.user_Agelist = user_Agelist;
		}
		public ArrayList<String> getUser_occupationlist() {
			return user_occupationlist;
		}
		public void setUser_occupationlist(ArrayList<String> user_occupationlist) {
			this.user_occupationlist = user_occupationlist;
		}
		public String getUser_occupationname() {
			return user_occupationname;
		}
		public void setUser_occupationname(String user_occupationname) {
			this.user_occupationname = user_occupationname;
		}
		public String getUser_occupationid() {
			return user_occupationid;
		}
		public void setUser_occupationid(String user_occupationid) {
			this.user_occupationid = user_occupationid;
		}
		public String getUser_hobbiesid() {
			return user_hobbiesid;
		}
		public void setUser_hobbiesid(String user_hobbiesid) {
			this.user_hobbiesid = user_hobbiesid;
		}
		public String getUser_hobbiesname() {
			return user_hobbiesname;
		}
		public void setUser_hobbiesname(String user_hobbiesname) {
			this.user_hobbiesname = user_hobbiesname;
		}
		public String getPlanID() {
			return planID;
		}
		public void setPlanID(String planID) {
			this.planID = planID;
		}
		public String getPlanname() {
			return planname;
		}
		public void setPlanname(String planname) {
			this.planname = planname;
		}
		public ArrayList<String> getUser_Genderlist() {
			return user_Genderlist;
		}
		public void setUser_Genderlist(ArrayList<String> user_Genderlist) {
			this.user_Genderlist = user_Genderlist;
		}
		public ArrayList<String> getUser_Workststusnamelist() {
			return user_Workststusnamelist;
		}
		public void setUser_Workststusnamelist(ArrayList<String> user_Workststusnamelist) {
			this.user_Workststusnamelist = user_Workststusnamelist;
		}
		public MultipartFile getIntroductionvideofile() {
			return introductionvideofile;
		}
		public void setIntroductionvideofile(MultipartFile introductionvideofile) {
			this.introductionvideofile = introductionvideofile;
		}
		public String getUser_Introductionvideo_Name() {
			return user_Introductionvideo_Name;
		}
		public void setUser_Introductionvideo_Name(String user_Introductionvideo_Name) {
			this.user_Introductionvideo_Name = user_Introductionvideo_Name;
		}


	    
	    
}
