/**
 */
package metaSDL.impl;

import java.util.Collection;
import metaSDL.CanalSys;
import metaSDL.MetaSDLPackage;
import metaSDL.Signal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Canal Sys</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaSDL.impl.CanalSysImpl#getCanalsys <em>Canalsys</em>}</li>
 *   <li>{@link metaSDL.impl.CanalSysImpl#getId <em>Id</em>}</li>
 *   <li>{@link metaSDL.impl.CanalSysImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CanalSysImpl extends MinimalEObjectImpl.Container implements CanalSys {
	/**
	 * The cached value of the '{@link #getCanalsys() <em>Canalsys</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanalsys()
	 * @generated
	 * @ordered
	 */
	protected CanalSys canalsys;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignal() <em>Signal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> signal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CanalSysImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaSDLPackage.Literals.CANAL_SYS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignal() {
		if (signal == null) {
			signal = new EObjectContainmentEList<Signal>(Signal.class, this, MetaSDLPackage.CANAL_SYS__SIGNAL);
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaSDLPackage.CANAL_SYS__SIGNAL:
			return ((InternalEList<?>) getSignal()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanalSys getCanalsys() {
		if (canalsys != null && canalsys.eIsProxy()) {
			InternalEObject oldCanalsys = (InternalEObject) canalsys;
			canalsys = (CanalSys) eResolveProxy(oldCanalsys);
			if (canalsys != oldCanalsys) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaSDLPackage.CANAL_SYS__CANALSYS,
							oldCanalsys, canalsys));
			}
		}
		return canalsys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanalSys basicGetCanalsys() {
		return canalsys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanalsys(CanalSys newCanalsys) {
		CanalSys oldCanalsys = canalsys;
		canalsys = newCanalsys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaSDLPackage.CANAL_SYS__CANALSYS, oldCanalsys,
					canalsys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaSDLPackage.CANAL_SYS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaSDLPackage.CANAL_SYS__CANALSYS:
			if (resolve)
				return getCanalsys();
			return basicGetCanalsys();
		case MetaSDLPackage.CANAL_SYS__ID:
			return getId();
		case MetaSDLPackage.CANAL_SYS__SIGNAL:
			return getSignal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaSDLPackage.CANAL_SYS__CANALSYS:
			setCanalsys((CanalSys) newValue);
			return;
		case MetaSDLPackage.CANAL_SYS__ID:
			setId((String) newValue);
			return;
		case MetaSDLPackage.CANAL_SYS__SIGNAL:
			getSignal().clear();
			getSignal().addAll((Collection<? extends Signal>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetaSDLPackage.CANAL_SYS__CANALSYS:
			setCanalsys((CanalSys) null);
			return;
		case MetaSDLPackage.CANAL_SYS__ID:
			setId(ID_EDEFAULT);
			return;
		case MetaSDLPackage.CANAL_SYS__SIGNAL:
			getSignal().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetaSDLPackage.CANAL_SYS__CANALSYS:
			return canalsys != null;
		case MetaSDLPackage.CANAL_SYS__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case MetaSDLPackage.CANAL_SYS__SIGNAL:
			return signal != null && !signal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CanalSysImpl
