/*
 * This file is generated by jOOQ.
 */
package jp.co.sysystem.springWorkout.domain.jooqObject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import jp.co.sysystem.springWorkout.domain.jooqObject.tables.User;
import jp.co.sysystem.springWorkout.domain.jooqObject.tables.Userdetail;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Workout extends SchemaImpl {

    private static final long serialVersionUID = -1846334689;

    /**
     * The reference instance of <code>workout</code>
     */
    public static final Workout WORKOUT = new Workout();

    /**
     * ユーザーマスタ
     */
    public final User USER = jp.co.sysystem.springWorkout.domain.jooqObject.tables.User.USER;

    /**
     * ユーザーマスタ詳細
     */
    public final Userdetail USERDETAIL = jp.co.sysystem.springWorkout.domain.jooqObject.tables.Userdetail.USERDETAIL;

    /**
     * No further instances allowed
     */
    private Workout() {
        super("workout", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            User.USER,
            Userdetail.USERDETAIL);
    }
}
