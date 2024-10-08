/*
 * This file is generated by jOOQ.
 */
package jp.co.sysystem.springWorkout.domain.jooqObject.tables.records;


import javax.annotation.processing.Generated;

import jp.co.sysystem.springWorkout.domain.jooqObject.tables.User;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * ユーザーマスタ
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = -426440218;

    /**
     * Setter for <code>workout.user.ID</code>. ユーザーID
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>workout.user.ID</code>. ユーザーID
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>workout.user.PASS</code>. パスワード
     */
    public void setPass(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>workout.user.PASS</code>. パスワード
     */
    public String getPass() {
        return (String) get(1);
    }

    /**
     * Setter for <code>workout.user.NAME</code>. 名前
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>workout.user.NAME</code>. 名前
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>workout.user.KANA</code>. カナ
     */
    public void setKana(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>workout.user.KANA</code>. カナ
     */
    public String getKana() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return User.USER.ID;
    }

    @Override
    public Field<String> field2() {
        return User.USER.PASS;
    }

    @Override
    public Field<String> field3() {
        return User.USER.NAME;
    }

    @Override
    public Field<String> field4() {
        return User.USER.KANA;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getPass();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getKana();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getPass();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getKana();
    }

    @Override
    public UserRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setPass(value);
        return this;
    }

    @Override
    public UserRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public UserRecord value4(String value) {
        setKana(value);
        return this;
    }

    @Override
    public UserRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(String id, String pass, String name, String kana) {
        super(User.USER);

        set(0, id);
        set(1, pass);
        set(2, name);
        set(3, kana);
    }
}
