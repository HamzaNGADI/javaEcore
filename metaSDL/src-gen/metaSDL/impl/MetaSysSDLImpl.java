/**
 */
package metaSDL.impl;

import java.util.Collection;

import metaSDL.Block;
import metaSDL.CanalSys;
import metaSDL.MetaSDLPackage;
import metaSDL.MetaSysSDL;
import metaSDL.Processus;
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
 * An implementation of the model object '<em><b>Meta Sys SDL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaSDL.impl.MetaSysSDLImpl#getCanalsys <em>Canalsys</em>}</li>
 *   <li>{@link metaSDL.impl.MetaSysSDLImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link metaSDL.impl.MetaSysSDLImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link metaSDL.impl.MetaSysSDLImpl#getProcessus <em>Processus</em>}</li>
 *   <li>{@link metaSDL.impl.MetaSysSDLImpl#getNameSys <em>Name Sys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaSysSDLImpl extends MinimalEObjectImpl.Container implements MetaSysSDL {
	/**
	 * The cached value of the '{@link #getCanalsys() <em>Canalsys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanalsys()
	 * @generated
	 * @ordered
	 */
	protected EList<CanalSys> canalsys;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> block;

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
	 * The cached value of the '{@link #getProcessus() <em>Processus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessus()
	 * @generated
	 * @ordered
	 */
	protected EList<Processus> processus;

	/**
	 * The default value of the '{@link #getNameSys() <em>Name Sys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSys()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSys() <em>Name Sys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSys()
	 * @generated
	 * @ordered
	 */
	protected String nameSys = NAME_SYS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaSysSDLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaSDLPackage.Literals.META_SYS_SDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CanalSys> getCanalsys() {
		if (canalsys == null) {
			canalsys = new EObjectContainmentEList<CanalSys>(CanalSys.class, this,
					MetaSDLPackage.META_SYS_SDL__CANALSYS);
		}
		return canalsys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlock() {
		if (block == null) {
			block = new EObjectContainmentEList<Block>(Block.class, this, MetaSDLPackage.META_SYS_SDL__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignal() {
		if (signal == null) {
			signal = new EObjectContainmentEList<Signal>(Signal.class, this, MetaSDLPackage.META_SYS_SDL__SIGNAL);
		}
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processus> getProcessus() {
		if (processus == null) {
			processus = new EObjectContainmentEList<Processus>(Processus.class, this,
					MetaSDLPackage.META_SYS_SDL__PROCESSUS);
		}
		return processus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSys() {
		return nameSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSys(String newNameSys) {
		String oldNameSys = nameSys;
		nameSys = newNameSys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaSDLPackage.META_SYS_SDL__NAME_SYS, oldNameSys,
					nameSys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetaSDLPackage.META_SYS_SDL__CANALSYS:
			return ((InternalEList<?>) getCanalsys()).basicRemove(otherEnd, msgs);
		case MetaSDLPackage.META_SYS_SDL__BLOCK:
			return ((InternalEList<?>) getBlock()).basicRemove(otherEnd, msgs);
		case MetaSDLPackage.META_SYS_SDL__SIGNAL:
			return ((InternalEList<?>) getSignal()).basicRemove(otherEnd, msgs);
		case MetaSDLPackage.META_SYS_SDL__PROCESSUS:
			return ((InternalEList<?>) getProcessus()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaSDLPackage.META_SYS_SDL__CANALSYS:
			return getCanalsys();
		case MetaSDLPackage.META_SYS_SDL__BLOCK:
			return getBlock();
		case MetaSDLPackage.META_SYS_SDL__SIGNAL:
			return getSignal();
		case MetaSDLPackage.META_SYS_SDL__PROCESSUS:
			return getProcessus();
		case MetaSDLPackage.META_SYS_SDL__NAME_SYS:
			return getNameSys();
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
		case MetaSDLPackage.META_SYS_SDL__CANALSYS:
			getCanalsys().clear();
			getCanalsys().addAll((Collection<? extends CanalSys>) newValue);
			return;
		case MetaSDLPackage.META_SYS_SDL__BLOCK:
			getBlock().clear();
			getBlock().addAll((Collection<? extends Block>) newValue);
			return;
		case MetaSDLPackage.META_SYS_SDL__SIGNAL:
			getSignal().clear();
			getSignal().addAll((Collection<? extends Signal>) newValue);
			return;
		case MetaSDLPackage.META_SYS_SDL__PROCESSUS:
			getProcessus().clear();
			getProcessus().addAll((Collection<? extends Processus>) newValue);
			return;
		case MetaSDLPackage.META_SYS_SDL__NAME_SYS:
			setNameSys((String) newValue);
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
		case MetaSDLPackage.META_SYS_SDL__CANALSYS:
			getCanalsys().clear();
			return;
		case MetaSDLPackage.META_SYS_SDL__BLOCK:
			getBlock().clear();
			return;
		case MetaSDLPackage.META_SYS_SDL__SIGNAL:
			getSignal().clear();
			return;
		case MetaSDLPackage.META_SYS_SDL__PROCESSUS:
			getProcessus().clear();
			return;
		case MetaSDLPackage.META_SYS_SDL__NAME_SYS:
			setNameSys(NAME_SYS_EDEFAULT);
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
		case MetaSDLPackage.META_SYS_SDL__CANALSYS:
			return canalsys != null && !canalsys.isEmpty();
		case MetaSDLPackage.META_SYS_SDL__BLOCK:
			return block != null && !block.isEmpty();
		case MetaSDLPackage.META_SYS_SDL__SIGNAL:
			return signal != null && !signal.isEmpty();
		case MetaSDLPackage.META_SYS_SDL__PROCESSUS:
			return processus != null && !processus.isEmpty();
		case MetaSDLPackage.META_SYS_SDL__NAME_SYS:
			return NAME_SYS_EDEFAULT == null ? nameSys != null : !NAME_SYS_EDEFAULT.equals(nameSys);
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
		result.append(" (nameSys: ");
		result.append(nameSys);
		result.append(')');
		return result.toString();
	}

} //MetaSysSDLImpl
