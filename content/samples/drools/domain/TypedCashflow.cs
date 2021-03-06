/**
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;

namespace org.drools.tutorials.banking
{
    public class TypedCashflow : Cashflow
    {
        public const int CREDIT = 0;
        public const int DEBIT = 1;

        public TypedCashflow()
        {
        }

        public TypedCashflow(string date, int type, double amount)
            : base(date, amount)
        {
            Type = type;
        }

        public TypedCashflow(DateTime date, int type, double amount)
            : base(date, amount)
        {
            Type = type;
        }

        public int Type { get; set; }

        public override String ToString()
        {
            return "TypedCashflow[date=" + Date + ",type=" + (Type == CREDIT ? "Credit" : "Debit") + ",amount=" + Amount + "]";
        }
    }
}
