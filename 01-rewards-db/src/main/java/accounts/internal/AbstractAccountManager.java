package accounts.internal;

import accounts.AccountManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractAccountManager implements AccountManager {

    protected final Logger logger;

    public AbstractAccountManager() {
        logger = LoggerFactory.getLogger(getClass());
        logger.info("Created {} account-manager", getInfo());
    }

    @Override
    public String getInfo() {
        String myClassName = getClass().getSimpleName();
        int idx = myClassName.indexOf("AccountManager");
        return idx == -1 ? "UNKNOWN" : myClassName.substring(0, idx).toUpperCase();
    }
}
