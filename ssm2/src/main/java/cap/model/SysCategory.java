package cap.model;

public class SysCategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_category.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_category.category_name
     *
     * @mbg.generated
     */
    private String categoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_category.articals
     *
     * @mbg.generated
     */
    private Integer articals;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_category.is_delete
     *
     * @mbg.generated
     */
    private Boolean isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_category.id
     *
     * @return the value of sys_category.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_category.id
     *
     * @param id the value for sys_category.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_category.category_name
     *
     * @return the value of sys_category.category_name
     * @mbg.generated
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_category.category_name
     *
     * @param categoryName the value for sys_category.category_name
     * @mbg.generated
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_category.articals
     *
     * @return the value of sys_category.articals
     * @mbg.generated
     */
    public Integer getArticals() {
        return articals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_category.articals
     *
     * @param articals the value for sys_category.articals
     * @mbg.generated
     */
    public void setArticals(Integer articals) {
        this.articals = articals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_category.is_delete
     *
     * @return the value of sys_category.is_delete
     * @mbg.generated
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_category.is_delete
     *
     * @param isDelete the value for sys_category.is_delete
     * @mbg.generated
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}}