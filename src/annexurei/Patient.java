/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annexurei;

/**
 *
 * @author Udayanga
 */
public class Patient {
    String id,name,gender,religion,race,town,employeement,date_birth,register_date,date_t6,date_t12,email,telephone,contact_person,
            adress,referedby,age,diognosis,level_motivation;
    String table_click;

    public Patient( String tbl){
        this.table_click=tbl;
    }
    public Patient(String id,String name,String gender,String religion,String race,String town,String employeement,
            String date_birth,String register_date,String date_t6,String date_t12,String email,String telephone,String contact_person,
            String adress,String referedby,String age,String diognosis,String level_motivation){
        this.id=id;this.name=name;
        this.gender=gender;this.religion=religion;this.race=race;
        this.town=town;this.employeement=employeement;this.date_birth=date_birth;
        this.register_date=register_date;this.date_t6=date_t6;this.date_t12=date_t12;
        this.email=email;this.telephone=telephone;this.contact_person=contact_person;
        this.adress=adress;this.referedby=referedby;this.age=age;
        this.diognosis=diognosis;this.level_motivation=level_motivation;
        
    }
    public String getTable_click() {
        return table_click;
    }

    public void setTable_click(String table_click) {
        this.table_click = table_click;
    }
    
    
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setEmployeement(String employeement) {
        this.employeement = employeement;
    }

    public void setDate_birth(String date_birth) {
        this.date_birth = date_birth;
    }

    public void setRegister_date(String register_date) {
        this.register_date = register_date;
    }

    public void setDate_t6(String date_t6) {
        this.date_t6 = date_t6;
    }

    public void setDate_t12(String date_t12) {
        this.date_t12 = date_t12;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setReferedby(String referedby) {
        this.referedby = referedby;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDiognosis(String diognosis) {
        this.diognosis = diognosis;
    }

    public void setLevel_motivation(String level_motivation) {
        this.level_motivation = level_motivation;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getReligion() {
        return religion;
    }

    public String getRace() {
        return race;
    }

    public String getTown() {
        return town;
    }

    public String getEmployeement() {
        return employeement;
    }

    public String getDate_birth() {
        return date_birth;
    }

    public String getRegister_date() {
        return register_date;
    }

    public String getDate_t6() {
        return date_t6;
    }

    public String getDate_t12() {
        return date_t12;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getContact_person() {
        return contact_person;
    }

    public String getAdress() {
        return adress;
    }

    public String getReferedby() {
        return referedby;
    }

    public String getAge() {
        return age;
    }

    public String getDiognosis() {
        return diognosis;
    }

    public String getLevel_motivation() {
        return level_motivation;
    }
    
}
