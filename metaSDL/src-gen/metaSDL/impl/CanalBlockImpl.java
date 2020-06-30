/**
 */
package metaSDL.impl;

import java.util.Collection;
import metaSDL.CanalBlock;
import metaSDL.MetaSDLPackage;
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
 * An implementation of the model object '<em><b>Canal Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaSDL.impl.CanalBlockImpl#getProcessus <em>Processus</em>}</li>
 *   <li>{@link metaSDL.impl.CanalBlockImpl#getCanalblock <em>Canalblock</em>}</li>
 *   <li>{@link metaSDL.impl.CanalBlockImpl#getId <em>Id</em>}</li>
 *   <li>{@link metaSDL.impl.CanalBlockImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CanalBlockImpl extends MinimalEObjectImpl.Container implements CanalBlock {
	/**
	 * The cached value of the '{@link #getProcessus() <em>Processus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessus()
	 * @generated
	 * @ordered
	 */
	protected Processus processus;

	/**
	 * The cached value of the '{@link #getCanalblock() <em>Canalblock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanalblock()
	 * @generated
	 * @ordered
	 */
	protected CanalBlock canalblock;

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
	protected CanalBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaSDLPackage.Literals.CANAL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processus getProcessus() {
		if (processus != null && processus.eIsProxy()) {
			InternalEObject oldProcessus = (InternalEObject) processus;
			processus = (Processus) eResolveProxy(oldProcessus);
			if (processus != oldProcessus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaSDLPackage.CANAL_BLOCK__PROCESSUS,
							oldProcessus, processus));
			}
		}
		return processus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processus basicGetProcessus() {
		return processus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessus(Processus newProcessus) {
		Processus oldProcessus = processus;
		processus = newProcessus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaSDLPackage.CANAL_BLOCK__PROCESSUS, oldProcessus,
					processus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanalBlock getCanalblock() {
		if (canalblock != null && canalblock.eIsProxy()) {
			InternalEObject oldCanalblock = (InternalEObject) canalblock;
			canalblock = (CanalBlock) eResolveProxy(oldCanalblock);
			if (canalblock != oldCanalblock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaSDLPackage.CANAL_BLOCK__CANALBLOCK,
							oldCanalblock, canalblock));
			}
		}
		return canalblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CanalBlock basicGetCanalblock() {
		return canalblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanalblock(CanalBlock newCanalblock) {
		CanalBlock oldCanalblock = canalblock;
		canalblock = newCanalblock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaSDLPackage.CANAL_BLOCK__CANALBLOCK, oldCanalblock,
					canalblock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getSignal() {
		if (signal == null) {
			signal = new EObjectContainmentEList<Signal>(Signal.class, this, MetaSDLPackage.CANAL_BLOCK__SIGNAL);
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
		case MetaSDLPackage.CANAL_BLOCK__SIGNAL:
			return ((InternalEList<?>) getSignal()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaSDLPackage.CANAL_BLOCK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaSDLPackage.CANAL_BLOCK__PROCESSUS:
			if (resolve)
				return getProcessus();
			return basicGetProcessus();
		case MetaSDLPackage.CANAL_BLOCK__CANALBLOCK:
			if (resolve)
				return getCanalblock();
			return basicGetCanalblock();
		case MetaSDLPackage.CANAL_BLOCK__ID:
			return getId();
		case MetaSDLPackage.CANAL_BLOCK__SIGNAL:
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
		case MetaSDLPackage.CANAL_BLOCK__PROCESSUS:
			setProcessus((Processus) newValue);
			return;
		case MetaSDLPackage.CANAL_BLOCK__CANALBLOCK:
			setCanalblock((CanalBlock) newValue);
			return;
		case MetaSDLPackage.CANAL_BLOCK__ID:
			setId((String) newValue);
			return;
		case MetaSDLPackage.CANAL_BLOCK__SIGNAL:
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
		case MetaSDLPackage.CANAL_BLOCK__PROCESSUS:
			setProcessus((Processus) null);
			return;
		case MetaSDLPackage.CANAL_BLOCK__CANALBLOCK:
			setCanalblock((CanalBlock) null);
			return;
		case MetaSDLPackage.CANAL_BLOCK__ID:
			setId(ID_EDEFAULT);
			return;
		case MetaSDLPackage.CANAL_BLOCK__SIGNAL:
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
		case MetaSDLPackage.CANAL_BLOCK__PROCESSUS:
			return processus != null;
		case MetaSDLPackage.CANAL_BLOCK__CANALBLOCK:
			return canalblock != null;
		case MetaSDLPackage.CANAL_BLOCK__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case MetaSDLPackage.CANAL_BLOCK__SIGNAL:
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

} //CanalBlockImpl
