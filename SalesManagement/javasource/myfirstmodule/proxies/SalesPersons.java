// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class SalesPersons implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject salesPersonsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.SalesPersons";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SalesPersonName("SalesPersonName"),
		SalesPersonLastName("SalesPersonLastName"),
		SalesPersonTitle("SalesPersonTitle"),
		HireDate("HireDate"),
		BirthDate("BirthDate"),
		MaritalStatus("MaritalStatus"),
		Gender("Gender"),
		MonthlySalary("MonthlySalary"),
		Status("Status");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SalesPersons(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected SalesPersons(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject salesPersonsMendixObject)
	{
		if (salesPersonsMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, salesPersonsMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.salesPersonsMendixObject = salesPersonsMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.SalesPersons initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.SalesPersons(context, mendixObject);
	}

	public static myfirstmodule.proxies.SalesPersons load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.SalesPersons.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.SalesPersons> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.SalesPersons.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of SalesPersonName
	 */
	public final java.lang.String getSalesPersonName()
	{
		return getSalesPersonName(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesPersonName
	 */
	public final java.lang.String getSalesPersonName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SalesPersonName.toString());
	}

	/**
	 * Set value of SalesPersonName
	 * @param salespersonname
	 */
	public final void setSalesPersonName(java.lang.String salespersonname)
	{
		setSalesPersonName(getContext(), salespersonname);
	}

	/**
	 * Set value of SalesPersonName
	 * @param context
	 * @param salespersonname
	 */
	public final void setSalesPersonName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String salespersonname)
	{
		getMendixObject().setValue(context, MemberNames.SalesPersonName.toString(), salespersonname);
	}

	/**
	 * @return value of SalesPersonLastName
	 */
	public final java.lang.String getSalesPersonLastName()
	{
		return getSalesPersonLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesPersonLastName
	 */
	public final java.lang.String getSalesPersonLastName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SalesPersonLastName.toString());
	}

	/**
	 * Set value of SalesPersonLastName
	 * @param salespersonlastname
	 */
	public final void setSalesPersonLastName(java.lang.String salespersonlastname)
	{
		setSalesPersonLastName(getContext(), salespersonlastname);
	}

	/**
	 * Set value of SalesPersonLastName
	 * @param context
	 * @param salespersonlastname
	 */
	public final void setSalesPersonLastName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String salespersonlastname)
	{
		getMendixObject().setValue(context, MemberNames.SalesPersonLastName.toString(), salespersonlastname);
	}

	/**
	 * @return value of SalesPersonTitle
	 */
	public final java.lang.String getSalesPersonTitle()
	{
		return getSalesPersonTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesPersonTitle
	 */
	public final java.lang.String getSalesPersonTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SalesPersonTitle.toString());
	}

	/**
	 * Set value of SalesPersonTitle
	 * @param salespersontitle
	 */
	public final void setSalesPersonTitle(java.lang.String salespersontitle)
	{
		setSalesPersonTitle(getContext(), salespersontitle);
	}

	/**
	 * Set value of SalesPersonTitle
	 * @param context
	 * @param salespersontitle
	 */
	public final void setSalesPersonTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String salespersontitle)
	{
		getMendixObject().setValue(context, MemberNames.SalesPersonTitle.toString(), salespersontitle);
	}

	/**
	 * @return value of HireDate
	 */
	public final java.util.Date getHireDate()
	{
		return getHireDate(getContext());
	}

	/**
	 * @param context
	 * @return value of HireDate
	 */
	public final java.util.Date getHireDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.HireDate.toString());
	}

	/**
	 * Set value of HireDate
	 * @param hiredate
	 */
	public final void setHireDate(java.util.Date hiredate)
	{
		setHireDate(getContext(), hiredate);
	}

	/**
	 * Set value of HireDate
	 * @param context
	 * @param hiredate
	 */
	public final void setHireDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date hiredate)
	{
		getMendixObject().setValue(context, MemberNames.HireDate.toString(), hiredate);
	}

	/**
	 * @return value of BirthDate
	 */
	public final java.util.Date getBirthDate()
	{
		return getBirthDate(getContext());
	}

	/**
	 * @param context
	 * @return value of BirthDate
	 */
	public final java.util.Date getBirthDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.BirthDate.toString());
	}

	/**
	 * Set value of BirthDate
	 * @param birthdate
	 */
	public final void setBirthDate(java.util.Date birthdate)
	{
		setBirthDate(getContext(), birthdate);
	}

	/**
	 * Set value of BirthDate
	 * @param context
	 * @param birthdate
	 */
	public final void setBirthDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date birthdate)
	{
		getMendixObject().setValue(context, MemberNames.BirthDate.toString(), birthdate);
	}

	/**
	 * Get value of MaritalStatus
	 * @param maritalstatus
	 */
	public final myfirstmodule.proxies.MaritalStatus getMaritalStatus()
	{
		return getMaritalStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of MaritalStatus
	 */
	public final myfirstmodule.proxies.MaritalStatus getMaritalStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.MaritalStatus.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.MaritalStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of MaritalStatus
	 * @param maritalstatus
	 */
	public final void setMaritalStatus(myfirstmodule.proxies.MaritalStatus maritalstatus)
	{
		setMaritalStatus(getContext(), maritalstatus);
	}

	/**
	 * Set value of MaritalStatus
	 * @param context
	 * @param maritalstatus
	 */
	public final void setMaritalStatus(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.MaritalStatus maritalstatus)
	{
		if (maritalstatus != null) {
			getMendixObject().setValue(context, MemberNames.MaritalStatus.toString(), maritalstatus.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.MaritalStatus.toString(), null);
		}
	}

	/**
	 * Get value of Gender
	 * @param gender
	 */
	public final myfirstmodule.proxies.Gender getGender()
	{
		return getGender(getContext());
	}

	/**
	 * @param context
	 * @return value of Gender
	 */
	public final myfirstmodule.proxies.Gender getGender(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Gender.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.Gender.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final void setGender(myfirstmodule.proxies.Gender gender)
	{
		setGender(getContext(), gender);
	}

	/**
	 * Set value of Gender
	 * @param context
	 * @param gender
	 */
	public final void setGender(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Gender gender)
	{
		if (gender != null) {
			getMendixObject().setValue(context, MemberNames.Gender.toString(), gender.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Gender.toString(), null);
		}
	}

	/**
	 * @return value of MonthlySalary
	 */
	public final java.lang.Integer getMonthlySalary()
	{
		return getMonthlySalary(getContext());
	}

	/**
	 * @param context
	 * @return value of MonthlySalary
	 */
	public final java.lang.Integer getMonthlySalary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.MonthlySalary.toString());
	}

	/**
	 * Set value of MonthlySalary
	 * @param monthlysalary
	 */
	public final void setMonthlySalary(java.lang.Integer monthlysalary)
	{
		setMonthlySalary(getContext(), monthlysalary);
	}

	/**
	 * Set value of MonthlySalary
	 * @param context
	 * @param monthlysalary
	 */
	public final void setMonthlySalary(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer monthlysalary)
	{
		getMendixObject().setValue(context, MemberNames.MonthlySalary.toString(), monthlysalary);
	}

	/**
	 * Get value of Status
	 * @param status
	 */
	public final myfirstmodule.proxies.Status getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final myfirstmodule.proxies.Status getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.Status.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(myfirstmodule.proxies.Status status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Status status)
	{
		if (status != null) {
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return salesPersonsMendixObject;
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.SalesPersons that = (myfirstmodule.proxies.SalesPersons) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
