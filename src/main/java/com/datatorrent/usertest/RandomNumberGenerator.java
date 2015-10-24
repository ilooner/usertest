/**
 * Put your copyright and license info here.
 */
package com.datatorrent.usertest;

import com.datatorrent.api.Context.OperatorContext;
import com.datatorrent.api.DefaultOutputPort;
import com.datatorrent.api.InputOperator;
import com.datatorrent.common.util.BaseOperator;
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
    LOG.info("User {}", System.getProperty("user.name"));
  }

  @Override
  public void emitTuples()
  {
  }

  private static final Logger LOG = LoggerFactory.getLogger(RandomNumberGenerator.class);
}
