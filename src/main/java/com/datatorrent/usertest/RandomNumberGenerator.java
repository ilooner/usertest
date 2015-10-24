/**
 * Put your copyright and license info here.
 */
package com.datatorrent.usertest;

import com.datatorrent.api.Context.OperatorContext;
import com.datatorrent.api.DefaultOutputPort;
import com.datatorrent.api.InputOperator;
import com.datatorrent.common.util.BaseOperator;
import java.io.IOException;
import java.util.logging.Level;
import org.apache.hadoop.security.UserGroupInformation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a simple operator that emits random number.
 */
public class RandomNumberGenerator extends BaseOperator implements InputOperator
{
  @Override
  public void setup(OperatorContext context)
  {
    try {
      LOG.info("User {}", UserGroupInformation.getCurrentUser().getUserName());
    } catch (IOException ex) {
      throw new RuntimeException(ex);
    }
  }

  @Override
  public void emitTuples()
  {
  }

  private static final Logger LOG = LoggerFactory.getLogger(RandomNumberGenerator.class);
}
