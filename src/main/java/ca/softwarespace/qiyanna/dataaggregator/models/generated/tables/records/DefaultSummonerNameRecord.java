/*
 * This file is generated by jOOQ.
 */
package ca.softwarespace.qiyanna.dataaggregator.models.generated.tables.records;


import ca.softwarespace.qiyanna.dataaggregator.models.generated.tables.DefaultSummonerName;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSummonerNameRecord extends UpdatableRecordImpl<DefaultSummonerNameRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 1190777014;

    /**
     * Setter for <code>qiyanna.default_summoner_name.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>qiyanna.default_summoner_name.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>qiyanna.default_summoner_name.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>qiyanna.default_summoner_name.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>qiyanna.default_summoner_name.regionname</code>.
     */
    public void setRegionname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>qiyanna.default_summoner_name.regionname</code>.
     */
    public String getRegionname() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DefaultSummonerName.DEFAULT_SUMMONER_NAME.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DefaultSummonerName.DEFAULT_SUMMONER_NAME.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DefaultSummonerName.DEFAULT_SUMMONER_NAME.REGIONNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRegionname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRegionname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultSummonerNameRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultSummonerNameRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultSummonerNameRecord value3(String value) {
        setRegionname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefaultSummonerNameRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DefaultSummonerNameRecord
     */
    public DefaultSummonerNameRecord() {
        super(DefaultSummonerName.DEFAULT_SUMMONER_NAME);
    }

    /**
     * Create a detached, initialised DefaultSummonerNameRecord
     */
    public DefaultSummonerNameRecord(Integer id, String name, String regionname) {
        super(DefaultSummonerName.DEFAULT_SUMMONER_NAME);

        set(0, id);
        set(1, name);
        set(2, regionname);
    }
}