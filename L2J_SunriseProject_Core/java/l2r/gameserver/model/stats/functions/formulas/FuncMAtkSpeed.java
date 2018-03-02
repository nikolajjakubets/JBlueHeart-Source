/*
 * Copyright (C) 2004-2015 L2J Server
 * 
 * This file is part of L2J Server.
 * 
 * L2J Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package l2r.gameserver.model.stats.functions.formulas;

import l2r.gameserver.model.stats.BaseStats;
import l2r.gameserver.model.stats.Env;
import l2r.gameserver.model.stats.Stats;
import l2r.gameserver.model.stats.functions.AbstractFunction;
import l2r.gameserver.model.stats.functions.LambdaConst;

/**
 * @author UnAfraid
 */
public class FuncMAtkSpeed extends AbstractFunction
{
	private static final FuncMAtkSpeed _fas_instance = new FuncMAtkSpeed();
	
	public static AbstractFunction getInstance()
	{
		return _fas_instance;
	}
	
	private FuncMAtkSpeed()
	{
		super(Stats.MAGIC_ATTACK_SPEED, 1, null, new LambdaConst(0), null);
	}
	
	@Override
	public void calc(Env env)
	{
		env.mulValue(BaseStats.WIT.calcBonus(env.getCharacter()));
	}
}