/*
 * This file is generated by jOOQ.
 */
package ca.softwarespace.qiyanna.dataaggregator.models.generated.tables.records;


import ca.softwarespace.qiyanna.dataaggregator.models.generated.tables.Tier;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class TierRecord extends UpdatableRecordImpl<TierRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 78536121;

    /**
     * Setter for <code>qiyanna.tier.tierid</code>.
     */
    public void setTierid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>qiyanna.tier.tierid</code>.
     */
    public Integer getTierid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>qiyanna.tier.shortname</code>.
     */
    public void setShortname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>qiyanna.tier.shortname</code>.
     */
    public String getShortname() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Tier.TIER.TIERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Tier.TIER.SHORTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getTierid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getShortname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTierid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getShortname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TierRecord value1(Integer value) {
        setTierid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TierRecord value2(String value) {
        setShortname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TierRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TierRecord
     */
    public TierRecord() {
        super(Tier.TIER);
    }

    /**
     * Create a detached, initialised TierRecord
     */
    public TierRecord(Integer tierid, String shortname) {
        super(Tier.TIER);

        set(0, tierid);
        set(1, shortname);
    }
}